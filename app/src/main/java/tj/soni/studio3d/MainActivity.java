package tj.soni.studio3d;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.net.Uri;
import java.io.InputStream;
public class MainActivity extends Activity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    WebView w = new WebView(this);
    w.setBackgroundColor(0xff080d14);
    WebSettings s = w.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    s.setAllowContentAccess(true);
    s.setMediaPlaybackRequiresUserGesture(true);
    w.setWebChromeClient(new WebChromeClient());
    w.setWebViewClient(new WebViewClient());
    setContentView(w);
    w.loadUrl("file:///android_asset/www/index.html");
  }
  @Override public void onBackPressed() { super.onBackPressed(); }
}
