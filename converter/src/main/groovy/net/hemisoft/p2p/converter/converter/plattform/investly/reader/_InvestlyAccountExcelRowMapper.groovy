package net.hemisoft.p2p.converter.converter.plattform.investly.reader

import org.springframework.batch.item.excel.support.rowset.RowSet

import groovy.transform.PackageScope
import net.hemisoft.p2p.converter.converter.plattform.investly.dto.InvestlyAccountDto
import net.hemisoft.p2p.converter.plattform.dto.AbstractAccountDto
import net.hemisoft.p2p.converter.plattform.key.ExcelColum
import net.hemisoft.p2p.converter.plattform.mapper.AbstractAccountExcelRowMapper

@PackageScope
class _InvestlyAccountExcelRowMapper extends AbstractAccountExcelRowMapper<InvestlyAccountDto> {
	private static final int COL_TRANSFER_TYPE    = ExcelColum.E.ordinal()
	private static final int COL_INVESTED_AMOUNT  = ExcelColum.D.ordinal()
	private static final int COL_ISSUED           = ExcelColum.A.ordinal()

	@Override InvestlyAccountDto mapRow(RowSet rs) throws Exception {
		super.mapRow(rs)
	}

	@Override int getTransferTypeColumnIndex()   { COL_TRANSFER_TYPE   }
	@Override int getInvestedAmountColumnIndex() { COL_INVESTED_AMOUNT }
	@Override int getIssuedColumnIndex()         { COL_ISSUED          }
	
	@Override AbstractAccountDto createNewDto() {
		InvestlyAccountDto.newInstance()
	}
}