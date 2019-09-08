package net.hemisoft.p2p.importer.plattform.viventor.listener

import org.springframework.stereotype.Component

import groovy.util.logging.Slf4j
import net.hemisoft.p2p.importer.commons.plattform.listener.AbstractJobExecutionListener
import net.hemisoft.p2p.importer.domain.Plattform
import net.hemisoft.p2p.importer.plattform.twino.service.TwinoAccountImportService


@Slf4j
@Component
public class ViventorJobExecutionListener extends AbstractJobExecutionListener {
	private static final Plattform PLATTFORM = Plattform.TWINO

	ViventorJobExecutionListener(TwinoAccountImportService service) {
		super(PLATTFORM, service)
	}
}