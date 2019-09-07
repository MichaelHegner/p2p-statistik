package net.hemisoft.p2p.importer.plattform.robocash.processor

import org.springframework.stereotype.Component

import net.hemisoft.p2p.importer.commons.plattform.processor.AbstractAccountItemProcessor
import net.hemisoft.p2p.importer.domain.Account
import net.hemisoft.p2p.importer.domain.Plattform
import net.hemisoft.p2p.importer.domain.TransferType
import net.hemisoft.p2p.importer.plattform.robocash.dto.RobocashAccountDto

@Component
public class RobocashAccountItemProcessor extends AbstractAccountItemProcessor<RobocashAccountDto, Account> {
	@Override Account process(RobocashAccountDto dto) throws Exception {
		super.process(dto)
	}
	
	@Override Plattform createPlattform()   { Plattform.ROBOCASH }
	
	@Override TransferType createTransferType(String transferType) {
		switch(transferType) {
			case "Adding funds":      TransferType.DEPOSIT;  break
			case "Withdrawing funds": TransferType.WITHDRAW; break
			default: null
		}
	}
}
