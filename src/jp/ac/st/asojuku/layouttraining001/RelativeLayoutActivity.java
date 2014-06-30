package jp.ac.st.asojuku.layouttraining001;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RelativeLayoutActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relativelayout_activity);
		Button btn = (Button)findViewById(R.id.button1);
		btn.setOnClickListener(this);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
		case R.id.button1:
			ImageView img = (ImageView)findViewById(R.id.imageView1);
			img.setImageResource(R.drawable.danger);
			break;
		}
	}
}
