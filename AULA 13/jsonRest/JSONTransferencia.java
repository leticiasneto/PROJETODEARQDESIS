package jsonRest;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import model.Cliente;
import model.Conta;

public class JSONTransferencia {

	public static StringBuilder montaJSon(HttpServletRequest request)
			throws IOException {
			StringBuilder sb = new StringBuilder();
			BufferedReader reader = request.getReader();
			try {
			String line;
			while ((line = reader.readLine()) != null) {
			sb.append(line).append('\n');
			}
			} finally {
			reader.close();
			}
			return sb;
			}
			public static String listToJSon(ArrayList<Conta> lista) {
			JSONArray vetor = new JSONArray();
			for (Conta to : lista) {
			JSONObject object = new JSONObject();
			try {
			object.put("Numero", to.getNumero());
			object.put("Agencia", to.getAgencia());
			object.put("Tipo", to.getTipo());
			object.put("Valor", to.getValor());
			vetor.put(object);
			} catch (JSONException e) {
			e.printStackTrace();
			}
			}
			return vetor.toString();
			}
			public static Conta jSonToConta(String json) throws IOException{
			try{
			JSONObject registro = new JSONObject(json);
			String agencia = registro.getString("numero");
			String numero = registro.getString("agencia");
			String tipo = registro.getString("tipo");
			String valor = registro.getString("valor");
			Conta conta = new Conta(numero, agencia, tipo, valor);
			
			return conta;
			} catch(JSONException jsone){
			jsone.printStackTrace();
			throw new IOException(jsone);
			}
			}
			
			public static Conta jSonToContaTrasfer(String json) throws IOException{
				try{
				JSONObject registro = new JSONObject(json);
				String agencia = registro.getString("numero");
				String numero = registro.getString("agencia");
				String tipo = registro.getString("tipo");
				String valor = registro.getString("valor");
				Conta conta = new Conta(numero, agencia, tipo, valor);
				
				return conta;
				} catch(JSONException jsone){
				jsone.printStackTrace();
				throw new IOException(jsone);
				}
				}
			
			public static String clienteToJSon(Cliente cliente) throws IOException {
			JSONObject object = new JSONObject();
			try {
			object.put("id", cliente.getId());
			object.put("nome", cliente.getNome());
			object.put("fone", cliente.getFone());
			object.put("email", cliente.getEmail());
			} catch (JSONException e) {
			e.printStackTrace();
			}
			return object.toString();
			}
			public static String errorToJSon(Exception e) {
			JSONObject object = new JSONObject();
			try {
			object.put("error", e.toString());
			} catch (JSONException e1) {
			e.printStackTrace();
			}
			return object.toString();
			}
}
