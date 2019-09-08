package net.hemisoft.p2p.converter.converter.plattform.peerberry.listener

import org.springframework.stereotype.Component

import groovy.util.logging.Slf4j
import net.hemisoft.p2p.converter.converter.plattform.peerberry.service.PeerberryAccountImportService
import net.hemisoft.p2p.converter.domain.entity.Plattform
import net.hemisoft.p2p.converter.plattform.listener.AbstractJobExecutionListener


@Slf4j
@Component
public class PeerberryJobExecutionListener extends AbstractJobExecutionListener {
	private static final Plattform PLATTFORM = Plattform.PEERBERRY

	PeerberryJobExecutionListener(PeerberryAccountImportService service) {
		super(PLATTFORM, service)
	}
}