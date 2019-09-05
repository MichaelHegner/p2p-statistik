package net.hemisoft.p2p.importer.plattform.swaper

import org.springframework.batch.item.ItemWriter
import org.springframework.beans.factory.annotation.Autowired

import groovy.util.logging.Slf4j

@Slf4j
public class SwaperItemWriter implements ItemWriter {
	@Autowired SwaperImportService service
	
	@Override void write(List items) throws Exception {
		service.saveLoans items
	}
}
