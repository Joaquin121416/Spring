package com.venta.sysven.fn.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.venta.sysven.bean.Producto;

public class TProductoRowMapper implements RowMapper<Producto> {

	@Override
	public Producto mapRow(ResultSet row, int rowNum) throws SQLException {
		Producto pro = new Producto();
		pro.setNomPro(row.getObject(1,String.class));
		return pro;
	}

}
