
package jp.asciimw.androidbook.chapter1.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * メイン画面のアクティビティクラス
 * 
 * @author ryu
 */
public class MainActivity extends Activity {

    /** 
     * メイン画面表示時の初期処理を行います。
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ビルドするとR.javaにbutton1が追加される。
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(),
                        "ボタンが押されました。",
                        Toast.LENGTH_SHORT).show();
            }

        });
    }

    /** * */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
