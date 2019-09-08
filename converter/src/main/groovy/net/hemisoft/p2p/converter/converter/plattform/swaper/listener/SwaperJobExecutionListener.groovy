package net.hemisoft.p2p.converter.converter.plattform.swaper.listener

import org.springframework.stereotype.Component

import groovy.util.logging.Slf4j
import net.hemisoft.p2p.converter.converter.plattform.swaper.service.SwaperAccountImportService
import net.hemisoft.p2p.converter.domain.entity.Plattform
import net.hemisoft.p2p.converter.plattform.listener.AbstractJobExecutionListener


@Slf4j
@Component
public class SwaperJobExecutionListener extends AbstractJobExecutionListener {
	private static final Plattform PLATTFORM = Plattform.SWAPER

	SwaperJobExecutionListener(SwaperAccountImportService service) {
		super(PLATTFORM, service)
	}
}