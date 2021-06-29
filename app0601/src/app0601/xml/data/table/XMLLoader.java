package app0601.xml.data.table;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class XMLLoader {
	HttpURLConnection conn;
	
	public String load(String keyword) throws IOException{
		String key = "iAd8qwPUs7EMdMzOmijVHXuhRKzKwlxmOwUiVU8W0o0%2FvU8Ah5UDx9ieElATT8CYtidgskGvK4UEvnK12ASkow%3D%3D";
		
		//Get방식의 요청주소 구성(파라미터 포함)
		StringBuilder urlBuilder = new StringBuilder("http://openapi.forest.go.kr/openapi/service/trailInfoService/getforeststoryservice"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "="+key); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("mntnNm","UTF-8") + "=" + URLEncoder.encode(keyword, "UTF-8")); /**/
        urlBuilder.append("&" + URLEncoder.encode("mntnHght","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
        urlBuilder.append("&" + URLEncoder.encode("mntnAdd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
        urlBuilder.append("&" + URLEncoder.encode("mntnInfoAraCd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
        urlBuilder.append("&" + URLEncoder.encode("mntnInfoSsnCd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
        urlBuilder.append("&" + URLEncoder.encode("mntnInfoThmCd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
        
        //GET방식 요청
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        
        //요청에 의해 생성된 스트림을 통해 데이터 추출
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        
        return sb.toString(); //생성된 태그를 반환
	}
	
	public InputStream loadFromStream(String keyword) throws IOException{
		String key = "iAd8qwPUs7EMdMzOmijVHXuhRKzKwlxmOwUiVU8W0o0%2FvU8Ah5UDx9ieElATT8CYtidgskGvK4UEvnK12ASkow%3D%3D";
		
		//Get방식의 요청주소 구성(파라미터 포함)
		StringBuilder urlBuilder = new StringBuilder("http://openapi.forest.go.kr/openapi/service/trailInfoService/getforeststoryservice"); /*URL*/
		urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "="+key); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("mntnNm","UTF-8") + "=" + URLEncoder.encode(keyword, "UTF-8")); /**/
		urlBuilder.append("&" + URLEncoder.encode("mntnHght","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
		urlBuilder.append("&" + URLEncoder.encode("mntnAdd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
		urlBuilder.append("&" + URLEncoder.encode("mntnInfoAraCd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
		urlBuilder.append("&" + URLEncoder.encode("mntnInfoSsnCd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
		urlBuilder.append("&" + URLEncoder.encode("mntnInfoThmCd","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /**/
		
		//GET방식 요청
		URL url = new URL(urlBuilder.toString());
		conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		
		return conn.getInputStream(); //생성된 태그를 반환
	}
	public void close() {
		if(conn!=null) {
			conn.disconnect();
		}
	}
}
