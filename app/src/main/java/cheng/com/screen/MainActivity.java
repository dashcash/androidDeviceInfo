package cheng.com.screen;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		float density = getResources().getDisplayMetrics().density;

		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);

		// will either be DENSITY_LOW, DENSITY_MEDIUM or DENSITY_HIGH
		int dpiClassification = dm.densityDpi;

		// these will return the actual dpi horizontally and vertically
		float xDpi = dm.xdpi;
		float yDpi = dm.ydpi;

		String allParams = "Real Screen size : \n density : " + dpiClassification + " \n screen density width : " + xDpi + "\n screen density height : " + yDpi;
		TextView reelScreenParam = (TextView) findViewById(R.id.screenSizeReel);
		reelScreenParam.setText(allParams);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.§
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings)
		{
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
