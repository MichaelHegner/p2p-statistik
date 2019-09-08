package net.hemisoft.p2p.converter.converter.plattform.twino.listener

import org.springframework.stereotype.Component

import groovy.util.logging.Slf4j
import net.hemisoft.p2p.converter.converter.plattform.twino.service.TwinoAccountImportService
import net.hemisoft.p2p.converter.domain.entity.Plattform
import net.hemisoft.p2p.converter.plattform.listener.AbstractAccountStepExecutionListener


@Slf4j
@Component
public class TwinoAccountStepExecutionListener extends AbstractAccountStepExecutionListener {
	private static final Plattform PLATTFORM = Plattform.TWINO
	
	TwinoAccountStepExecutionListener(TwinoAccountImportService service) {
		super(PLATTFORM, service)
	}
}