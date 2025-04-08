package com.example.gestortareas;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WebFragment extends Fragment {

    public WebFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web, container, false);

        EditText urlInput = view.findViewById(R.id.input_url);
        Button botonBuscar = view.findViewById(R.id.btn_ir);
        WebView webView = view.findViewById(R.id.webview);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true); // Opcional

        botonBuscar.setOnClickListener(v -> {
            String url = urlInput.getText().toString();
            if (!TextUtils.isEmpty(url)) {
                if (!url.startsWith("http")) {
                    url = "https://" + url;
                }
                webView.loadUrl(url);
            }
        });

        return view;
    }
}