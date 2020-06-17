package com.hh.myapplication

import android.util.Log
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

/**
 * Created by Rajeev Sahu on 1/6/20.
 */
class MyCareTeamConsult {

    fun handleNetworkCall(callback: VolleyCallback) {
        //val url = "https://api.ipify.org/?format=json"
        val url = "https://jsonplaceholder.typicode.com/todos/"
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(MyApplication.getContext())

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                Log.d("MyCareTeamCOnsult", "Response is: ${response}")
                callback.onSuccess(response);
            },
            Response.ErrorListener {
                Log.d("MyCareTeamCOnsult", "That didn't work!")
                callback.onError("ERROR RESPONSE");
            })

        // Add the request to the RequestQueue.
        queue.add(stringRequest)
    }

    interface VolleyCallback {
        fun onSuccess(successResponse: String?)
        fun onError(errorResponse: String?)
    }
}
