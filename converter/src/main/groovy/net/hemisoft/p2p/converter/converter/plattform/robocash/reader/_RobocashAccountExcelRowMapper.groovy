package net.hemisoft.p2p.converter.converter.plattform.robocash.reader

import org.springframework.batch.item.excel.support.rowset.RowSet

import groovy.transform.PackageScope
import net.hemisoft.p2p.converter.converter.plattform.robocash.dto.RobocashAccountDto
import net.hemisoft.p2p.converter.plattform.dto.AbstractAccountDto
import net.hemisoft.p2p.converter.plattform.key.ExcelColum
import net.hemisoft.p2p.converter.plattform.mapper.AbstractAccountExcelRowMapper

@PackageScope
class _RobocashAccountExcelRowMapper extends AbstractAccountExcelRowMapper<RobocashAccountDto> {
	private static final int COL_TRANSFER_TYPE    = ExcelColum.D.ordinal()
	private static final int COL_INVESTED_AMOUNT  = ExcelColum.H.ordinal()
	private static final int COL_ISSUED           = ExcelColum.B.ordinal()

	@Override RobocashAccountDto mapRow(RowSet rs) throws Exception {
		super.mapRow(rs)
	}

	@Override int getTransferTypeColumnIndex()   { COL_TRANSFER_TYPE   }
	@Override int getInvestedAmountColumnIndex() { COL_INVESTED_AMOUNT }
	@Override int getIssuedColumnIndex()         { COL_ISSUED          }
	
	@Override AbstractAccountDto createNewDto() {
		RobocashAccountDto.newInstance()
	}
}