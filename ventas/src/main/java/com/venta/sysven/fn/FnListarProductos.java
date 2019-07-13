package com.venta.sysven.fn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.venta.sysven.bean.Producto;

@Component
public class FnListarProductos extends StoredProcedure {

	private static final String PROC_NAME = "fn_listar_producto";

	public FnListarProductos(DataSource ds) {
		super(ds, PROC_NAME);
		// declareParameter(new SqlOutParameter("RESULT", java.sql.Types.OTHER, new
		// TProductoRowMapper()));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Producto> execute() {
		Map<String, Object> input = new HashMap<>();
		Map<String, Object> result = super.execute(input);

		@SuppressWarnings("unused")
		ObjectMapper obj = new ObjectMapper();
		List<Producto> lista = new ArrayList<Producto>();
		for (Object row : (List) result.get("#result-set-1")) {
			@SuppressWarnings("unused")
			Map<Object, Object> map = (Map) row;

			Producto pro = new Producto();
			pro.setNomPro((String) map.get("nom_pro"));
			lista.add(pro);

		}

		return lista;

	}

}
