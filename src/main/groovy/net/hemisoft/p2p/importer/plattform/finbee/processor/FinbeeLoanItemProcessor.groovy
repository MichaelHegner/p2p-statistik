package net.hemisoft.p2p.importer.plattform.finbee.processor

import org.springframework.stereotype.Component

import net.hemisoft.p2p.importer.commons.plattform.processor.AbstractLoanItemProcessor
import net.hemisoft.p2p.importer.domain.Loan
import net.hemisoft.p2p.importer.domain.Plattform
import net.hemisoft.p2p.importer.plattform.finbee.dto.FinbeeLoanDto

@Component
public class FinbeeLoanItemProcessor extends AbstractLoanItemProcessor<FinbeeLoanDto, Loan> {

	@Override Loan process(FinbeeLoanDto dto) throws Exception {
		super.process(dto)
	}

	@Override Plattform createPlattform()   { Plattform.FINBEE }
}
