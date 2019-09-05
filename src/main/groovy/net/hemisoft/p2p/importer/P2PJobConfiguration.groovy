package net.hemisoft.p2p.importer

import org.springframework.batch.core.BatchStatus
import org.springframework.batch.core.Job
import org.springframework.batch.core.JobExecution
import org.springframework.batch.core.JobExecutionListener
import org.springframework.batch.core.Step
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory
import org.springframework.batch.core.launch.support.RunIdIncrementer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import groovy.util.logging.Slf4j

@Slf4j
@Configuration
@EnableBatchProcessing
public class P2PJobConfiguration {
	private final JobBuilderFactory  jobBuilderFactory
	
	P2PJobConfiguration(JobBuilderFactory  jobBuilderFactory) {
		this.jobBuilderFactory = jobBuilderFactory
	}
	
	@Bean
	Job crowdestateImportJob(
		JobExecutionListener importP2PJobCompletionNotificationListener, 
		Step importBondoraDataStep,
		Step importCrowdestateDataStep,
		Step importDebitumDataStep,
		Step importEstateguruDataStep,
		Step importFinbeeDataStep,
		Step importFlenderDataStep,
		Step importGrupeerDataStep,
		Step importInvestlyDataStep,
		Step importIuvoDataStep,
		Step importMintosDataStep,
		Step importNeofinanceDataStep,
		Step importPeerberryDataStep,
		Step importRobocashDataStep,
		Step importSwaperDataStep,
		Step importTwinoDataStep,
		Step importViventorDataStep
	) {
		jobBuilderFactory.get("importP2PDataJob")
			.incrementer(RunIdIncrementer.newInstance())
			.listener(importP2PJobCompletionNotificationListener)
			.start(importBondoraDataStep)
			.next(importCrowdestateDataStep)
			.next(importDebitumDataStep)
			.next(importEstateguruDataStep)
			.next(importFinbeeDataStep)
			.next(importFlenderDataStep)
			.next(importGrupeerDataStep)
			.next(importInvestlyDataStep)
			.next(importIuvoDataStep)
			.next(importMintosDataStep)
			.next(importNeofinanceDataStep)
			.next(importPeerberryDataStep)
			.next(importRobocashDataStep)
			.next(importSwaperDataStep)
			.next(importTwinoDataStep)
			.next(importViventorDataStep)
			.build()
	}
	
	@Bean
	JobExecutionListener importP2PJobCompletionNotificationListener() {
		return new JobExecutionListener() {

			@Override
			public void beforeJob(JobExecution jobExecution) {
				// Nothing to do.
			}

			@Override
			public void afterJob(JobExecution jobExecution) {
				if(BatchStatus.COMPLETED == jobExecution.status) {
					log.info "!!! Import Job finished. !!!"
				}
			}
			
		}
	}
}
