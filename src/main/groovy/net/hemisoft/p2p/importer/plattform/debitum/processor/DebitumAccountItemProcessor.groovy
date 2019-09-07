package net.hemisoft.p2p.importer.plattform.debitum.processor

import org.springframework.stereotype.Component

import net.hemisoft.p2p.importer.commons.plattform.processor.AbstractAccountItemProcessor
import net.hemisoft.p2p.importer.domain.Account
import net.hemisoft.p2p.importer.domain.Plattform
import net.hemisoft.p2p.importer.domain.TransferType
import net.hemisoft.p2p.importer.plattform.debitum.dto.DebitumAccountDto

@Component
public class DebitumAccountItemProcessor extends AbstractAccountItemProcessor<DebitumAccountDto, Account> {
	@Override Account process(DebitumAccountDto dto) throws Exception {
		super.process(dto)
	}
	
	@Override Plattform createPlattform()   { Plattform.DEBITUM }
	
	@Override TransferType createTransferType(String transferType) {
		switch(transferType) {
			case "DEPOSIT":  TransferType.DEPOSIT;  break
			case "WITHDRAW": TransferType.WITHDRAW; break
			default: null
		}
	}
}
