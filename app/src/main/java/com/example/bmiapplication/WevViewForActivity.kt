package com.example.bmiapplication

import android.os.Bundle
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.bmiapplication.databinding.ActivityWevViewForBinding

class WevViewForActivity : AppCompatActivity() {
    private lateinit var bindingwebview: ActivityWevViewForBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingwebview= ActivityWevViewForBinding.inflate(layoutInflater)
        setContentView(bindingwebview.root)
        supportActionBar?.hide()
         bindingwebview.webView.webViewClient=MyWebViewClient()
         bindingwebview.webView.loadUrl("https://www.calculator.net/bmi-calculator.html")

    }

    inner class MyWebViewClient : WebViewClient(){
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            bindingwebview.progressbar.visibility=View.GONE
        }
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            return super.shouldOverrideUrlLoading(view, request)
        }
    }
}