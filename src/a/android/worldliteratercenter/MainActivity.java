package a.android.worldliteratercenter;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private static String[] days = { "শনিবার", "রবিবার", "সোমবার", "মঙ্গলবার",
			"বুধবার", "বৃহস্পতিবার", "শুক্রবার" };

	// String list[];

	private Spinner daySpinner;
	private ListView listView;
	private TextView textView;
	
//	Typeface typeface = Typeface.createFromAsset(getAssets(),
//			"font/kalpurush.ttf");

	ArrayAdapter<String> spinerAdapter, listAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		daySpinner = (Spinner) findViewById(R.id.daySpinner);
		listView = (ListView) findViewById(R.id.timeListView);
		textView = (TextView) findViewById(R.id.textView);
		
        //textView.setTypeface(typeface);

		spinerAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, days);
		// listAdapter = new ArrayAdapter<String>(getApplicationContext(),
		// R.layout.list_item, R.id.textView, list);

		daySpinner.setAdapter(spinerAdapter);

		daySpinner.setOnItemSelectedListener(listener);

		// listView.setAdapter(listAdapter);

	}

	OnItemSelectedListener listener = new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {

			switch (position) {
			case 0:
				String list1[] = {
						"লক্ষ্মীপুর কলেজ গেইট \nসকাল : ৯:৩০ - ১০:00",
						"অনুষদ ভবন \nইসলামী বিশ্ববিদ্যালয়\nসকাল : ১০:০০ - ১২:০০",
						"শহীদ জিয়াউর রহমান হল ও সাদ্দাম হোসেন হল \nদুপুর ১২:০০ – ০১:০০",
						"বঙ্গবন্ধু শেখ মুজিবুর রহমান হল \nদুপুর ০১:০০ – ০২:০০ ",
						"খালেদা জিয়া হল ও বেগম ফজিলাতুন্নেছা মুজিব হল \nবেলা ০২:০০ – ০৩:০০ " };
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list1);
				listView.setAdapter(listAdapter);
				//textView.setTypeface(typeface);
				break;
			case 1:
				String list2[] = {
						"ভাড়ামারা মহিলা কলেজ, পুজা মন্দিরের সামনে \nসকাল ০৯:৩০ – ১১:৩০",
						"ভেড়ামারা ডিগ্রি কলেজ মাঠ \nদুপুর ১১:০০ – ১২:০০ ",
						"ভেড়ামারা সরকারি বালিকা উচ্চ বিদ্যালয় \nদুপুর ১২:০০ – ০১:০০",
						"গোডাইন মোড় (ভেড়ামারা বালক বিদ্যালয়ের পাশে) \nবেলা ০১:০০ – ০১:৩০",
						"জি কে কলোনী ভেড়ামারা \nবেলা ০১:৩০ – ০২:৩০",
						"নওদাপাড়া ভেড়ামারা \nবেলা ০২:৩০ – ০৩:৩০ " };
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list2);
				listView.setAdapter(listAdapter);
				break;
			case 2:
				String list3[] = {
						"মেহেরপুর সরকারী কলেজ \nসকাল ০৯:৩০ – ১১:৩০ ",
						"মেহেরপুর সরকারী বালিকা উচ্চ বিদ্যালয় \nসকাল ১১:৩০ – ০১:০০ ",
						"মেহেরপুর সরকারী বালক উচ্চ বিদ্যালয় \nদুপুর ০১:০০ – ০২:০০ ",
						"মেহেরপুর উপজেলা পরিষদ\nদুপুর ০২:০০ – ০২:৩০ ",
						"বোসপাড়া গ্লোরিয়াস প্রি-ক্যাডেট একাডেমী \nদুপুর ০২:৩০ – ০৩:৩০ " };
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list3);
				listView.setAdapter(listAdapter);
				break;
			case 3:
				String list[] = {"আজ বন্ধের দিন"};
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list);
				listView.setAdapter(listAdapter);
				Toast.makeText(getApplicationContext(), "আজ বন্ধের দিন",
						Toast.LENGTH_LONG).show();
				break;
			case 4:
				String list4[] = {
						"কুষ্টিয়া পলিটেকনিক কলেজ \nদুপুর ০২:০০ – ০৩:৩০",
						"মিলপাড়া দোস্ত আব্দুল আজিজ সড়ক মাজারের পাশে \nবেলা ০৩:৩০ – ০৪:০০",
						"আড়ুয়াপাড়া তরুন সংঘ পাঠাগার, প্রাথমিক বিদ্যালয়ের সামনে \nবিকাল ০৪:০০ – ০৫:০০",
						"আড়ুয়াপারা দিন মনি প্রাথমিক বিদ্যালয় \nবিকাল ০৫:০০ – ০৬:০০",
						"কাটাইখানা মোড় সমাজ সেবা অফিস \nবিকাল ০৬:০০ – ০৭:০০",
						"ছয় রাস্তার মোড় \nসন্ধ্যা ০৭:০০ – ০৮:০০" };
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list4);
				listView.setAdapter(listAdapter);
				break;
			case 5:
				String list5[] = {
						"পুলিশ  লাইন স্কুল এন্ড কলেজ  \nসকাল ৯.০০ – ১০.০০ ",
						"কুষ্টিয়া সরকারি বালিকা উচ্চ বিদ্যালয় \nসকাল ১০.০০ – ১১.০০ ",
						"কুষ্টিয়া সরকারি কলেজ  \nসকাল ১১.০০ – ১২.০০ ",
						"রেন উইক গেট কমলাপুর রোড , কুষ্টিয়া  \nবিকেল ৪.০০ – ৪.৩০ ",
						"থানা পাড়া ক্রিসেন্ট ক্লাব ( প্রেস ক্লাব)\nবিকেল ৪.৩০ – ৫.০০ ",
						"আমলা পাড়া  প্রাইমারি স্কুল (৪ নং)\nবিকেল ৫.০০ – ৬.০০ ",
						"সরকারি কলেজ হোস্টেল মাঠ (পুকুর পাড়)\nসন্ধ্যা ০৬:০০ – ০৭:০০ " };
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list5);
				listView.setAdapter(listAdapter);

				break;
			case 6:

				String list6[] = {
						"হাউজিং নিশান মোড় \nসকাল ০৮:০০ – ০৯:০০",
						"বাবুপাড়া বারাদি \nসকাল ০৯:০০ – ০৯:৩০",
						"উপজেলা মোড় (উপজেলা অফিসের সামনে)\nসকাল ০৯:৩০ – ১০:০০",
						"পূর্ব মজমপুর, সাদ্দাম বাজার, নাসির ডাক্তারের গলি (৯৭ নং প্রাঃ বিঃ) \nসকাল ১০:০০ – ১১:০০",
						"পূর্ব মজমপুর বাহাউদ্দিন প্রাঃ বিঃ (জেলা স্কুলের সামনের গলি) \nসকাল ১১:০০ – ১২:০০",
						"কোর্ট পাড়া (নারিকেল তলা)\nদুপুর ০২:০০ – ০৩:৩০",
						"কোর্ট পাড়া লালন শাহ হাসপাতাল (গোরস্থানের সামনে) \nবিকেল ০৩:৩০ – ০৪:০০",
						"কালি শংকর পুর কানিজ পোল্ট্রি ফার্মের সামনে \nবিকেল ০৪:০০ – ০৫:০০",
						"সোনার বাংলা রোড মসজিদের পাশে \nবিকেল ০৫:০০ – ০৫:৩০",
						"পেয়ারা তলা, জেলখানা রোড, টালি পাড়া (মরিয়ম ক্লিনিকের পিছনে)\nবিকেল ০৫:৩০ – ০৬:০০",
						"পিটিআই মেইন গেট পেয়ারা তলা \nসন্ধ্যা ০৬:৩০ – ০৭:০০",
						"চৌড়হাস, ফুলতলা মসজিদ রোড \nরাত ০৭:০০ – ০৮:০০" };
				listAdapter = new ArrayAdapter<String>(getApplicationContext(),
						R.layout.list_item, R.id.textView, list6);
				listView.setAdapter(listAdapter);
				break;

			default:
				break;
			}
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {

		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
