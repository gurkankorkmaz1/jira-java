package xrayToken;

//import net.sf.json.JSONArray;
import org.json.*;
import okhttp3.*;

import java.io.IOException;

public class tokenFail {
    public static void main(String[] args) throws IOException {
        String endpoint = "https://xray.cloud.getxray.app/api/v1/import/execution";
        String bearerToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnQiOiI0ZWM1NDJjNS0xMmMyLTNlNGEtYTFkNi03YzkxZjYwMThhMmQiLCJhY2NvdW50SWQiOiI3MTIwMjA6ZDcyMGU3ZWItNzkxMi00YjRkLTk5MjItMWQ0NWY0ZmQxYmZiIiwiaXNYZWEiOmZhbHNlLCJpYXQiOjE2OTAyNzkwNTAsImV4cCI6MTY5MDM2NTQ1MCwiYXVkIjoiN0U0RUE4Q0EwQzhFNEE2NTg3NjZENjBBNTUxMDFCMEYiLCJpc3MiOiJjb20ueHBhbmRpdC5wbHVnaW5zLnhyYXkiLCJzdWIiOiI3RTRFQThDQTBDOEU0QTY1ODc2NkQ2MEE1NTEwMUIwRiJ9.E6W0_jyiQQDSEz_OtW1F8pz26_veoFV59AFpIBqQSnE";


        JSONObject requestBody = new JSONObject();
        JSONObject info = new JSONObject();
        info.put("summary", "Execution of automated tests for release");
        info.put("description", "This execution is automatically created when importing execution results from an external source");
        info.put("startDate", "2023-09-03T11:37:00+03:00");
        info.put("finishDate", "2023-09-04T11:50:00+03:00");
        requestBody.put("info", info);
        JSONArray tests = new JSONArray();

        JSONObject test1 = new JSONObject();
        test1.put("testKey", "JIR-2");
        test1.put("start", "2023-09-03T11:37:00+03:00");
        test1.put("finish", "2023-09-04T11:50:00+03:00");
        test1.put("comment", "Successful execution1");
        test1.put("status", "PASSED");
        tests.put(test1);

        JSONObject test2 = new JSONObject();
        test2.put("testKey", "JIR-3");
        test2.put("start", "2023-09-03T11:37:00+03:00");
        test2.put("finish", "2023-09-04T11:50:00+03:00");
        test2.put("comment", "Successful execution2");
        test2.put("status", "FAILED");
        tests.put(test2);

        JSONObject test3 = new JSONObject();
        test3.put("testKey", "JIR-4");
        test3.put("start", "2023-09-03T11:37:00+03:00");
        test3.put("finish", "2023-09-04T11:50:00+03:00");
        test3.put("comment", "Successful execution3");
        test3.put("status", "FAILED");
        tests.put(test3);

        JSONObject test4 = new JSONObject();
        test4.put("testKey", "JIR-5");
        test4.put("start", "2023-09-03T11:37:00+03:00");
        test4.put("finish", "2023-09-04T11:50:00+03:00");
        test4.put("comment", "Successful execution3");
        test4.put("status", "FAILED");
        tests.put(test4);

        JSONObject test5 = new JSONObject();
        test5.put("testKey", "JIR-6");
        test5.put("start", "2023-09-03T11:37:00+03:00");
        test5.put("finish", "2023-09-04T11:50:00+03:00");
        test5.put("comment", "Successful execution3");
        test5.put("status", "FAILED");
        tests.put(test5);

        JSONObject test6 = new JSONObject();
        test6.put("testKey", "JIR-7");
        test6.put("start", "2023-09-03T11:37:00+03:00");
        test6.put("finish", "2023-09-04T11:50:00+03:00");
        test6.put("comment", "Successful execution3");
        test6.put("status", "FAILED");
        tests.put(test6);

        JSONObject test7 = new JSONObject();
        test7.put("testKey", "JIR-8");
        test7.put("start", "2023-09-03T11:37:00+03:00");
        test7.put("finish", "2023-09-04T11:50:00+03:00");
        test7.put("comment", "Successful execution3");
        test7.put("status", "FAILED");
        tests.put(test7);
        requestBody.put("tests", tests);



        OkHttpClient client = new OkHttpClient();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, requestBody.toString());
        Request request = new Request.Builder()
                .url(endpoint)
                .addHeader("Authorization", "Bearer " + bearerToken)
                .post(body)
                .build();


        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();
        JSONObject jsonResponse = new JSONObject(responseBody);


        if (response.isSuccessful()) {
            System.out.println("Test execution created with key: " + jsonResponse.getString("key"));
        } else {
            System.out.println("Error creating test execution: " + jsonResponse.getString("error"));
        }
    }

    }
