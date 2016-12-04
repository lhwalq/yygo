package com.yygo.burma.base.activity;

import android.graphics.Bitmap;
import android.webkit.WebView;

import com.yygo.lib.base.BaseWebViewClient;
import com.yygo.lib.base.BaseWebViewFragment;

/**
 * AppWebViewActivity:项目webview页面基类
 * 
 * @author linhuan 2015年10月15日上午9:21:27
 */
public abstract class AppWebViewFragment extends BaseWebViewFragment {

	public class AppWebViewClient extends BaseWebViewClient {
		
		public AppWebViewClient(WebView webview) {
			super(webview);
		}
		
		@Override
		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			super.onPageStarted(view, url, favicon);
		}
		
		@Override
		public void onPageFinished(WebView view, String url) {
			super.onPageFinished(view, url);
			AppWebViewFragment.this.onPageFinished();
		}

		@Override
		public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
			super.onReceivedError(view, errorCode, description, failingUrl);
			AppWebViewFragment.this.onReceivedError();
		}
	}

	/**
	 * onPageFinished:加载完成
	 * 
	 * @author linhuan 2015-10-22下午3:49:23
	 */
	protected void onPageFinished() {

	}
	
	/**
	 * onReceivedError:网络不给力
	 * 
	 * @author linhuan 2015-10-22下午3:48:49
	 */
	protected void onReceivedError() {

	}

}
