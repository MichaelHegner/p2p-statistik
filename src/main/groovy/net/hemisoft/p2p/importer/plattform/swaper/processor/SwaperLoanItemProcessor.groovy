package net.hemisoft.p2p.importer.plattform.swaper.processor

import org.springframework.stereotype.Component

import net.hemisoft.p2p.importer.commons.plattform.processor.AbstractLoanItemProcessor
import net.hemisoft.p2p.importer.domain.Loan
import net.hemisoft.p2p.importer.domain.Plattform
import net.hemisoft.p2p.importer.plattform.swaper.dto.SwaperLoanDto

@Component
public class SwaperLoanItemProcessor extends AbstractLoanItemProcessor<SwaperLoanDto, Loan> {

	@Override Loan process(SwaperLoanDto dto) throws Exception {
		super.process(dto)
	}
	
	@Override Plattform createPlattform()   { Plattform.SWAPER }
	
	@Override String createLoanId(SwaperLoanDto dto) {
		def loanId = dto.loanId
		
		if (null == loanId) null
		else loanId.substring(0, loanId.indexOf("."))
	}

}
