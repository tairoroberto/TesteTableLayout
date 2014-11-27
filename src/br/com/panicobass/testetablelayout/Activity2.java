package br.com.panicobass.testetablelayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TableRow;
import android.widget.TextView;

public class Activity2 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		TableLayout layout = new TableLayout(this);
		layout.setLayoutParams(new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
		
		TableRow row = new TableRow(this);
		layout.addView(row);
		
		TextView textView = new TextView(this);
		textView.setText("Teste com TableLayout");
		textView.setTextColor(Color.BLUE);
		row.addView(textView);
		
		setContentView(layout);
	}
}
