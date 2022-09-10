package com.therionro.xcoreapi;

import affan.ahmad.otp.*;
import android.Manifest;
import android.animation.*;
import android.animation.ObjectAnimator;
import android.app.*;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.*;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.*;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Build;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.webkit.*;
import android.widget.*;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.*;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import br.tiagohm.codeview.CodeView;
import br.tiagohm.codeview.CodeView.OnHighlightListener;
import br.tiagohm.codeview.Language;
import br.tiagohm.codeview.Theme;
import com.airbnb.lottie.*;
import com.andrognito.patternlockview.PatternLockView;
import com.andrognito.patternlockview.listener.*;
import com.andrognito.patternlockview.utils.*;
import com.facebook.ads.*;
import com.google.android.gms.common.SignInButton;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import com.google.android.material.button.*;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import com.google.android.material.textfield.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.YouTubePlayerFullScreenListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.YouTubePlayerUtils;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.*;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sayuti.lib.WaveSideBar;
import com.sayuti.lib.WaveSideBar.OnLetterSelectedListener;
import de.hdodenhof.circleimageview.*;
import java.io.*;
import java.io.File;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class MainActivity extends AppCompatActivity {
	
	public final int REQ_CD_CAMERA = 101;
	public final int REQ_CD_FILEALL = 102;
	
	private Timer _timer = new Timer();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private ImageView imageview1;
	private TextView textview1;
	private TextView textview8;
	private TextView textview19;
	private TextView textview3;
	private TextView textview4;
	private TextView textview6;
	private TextView textview7;
	private TextView textview9;
	private EditText edittext2;
	private AutoCompleteTextView autocomplete1;
	private MultiAutoCompleteTextView multiautocomplete1;
	private ProgressBar progressbar2;
	private ProgressBar progressbar1;
	private ImageView imageview2;
	private CircleImageView circleimageview1;
	private RatingBar ratingbar1;
	private SearchView searchview1;
	private VideoView videoview1;
	private Switch switch1;
	private RadioButton radiobutton1;
	private CheckBox checkbox1;
	private SeekBar seekbar1;
	private TextView textview10;
	private Button button1;
	private MaterialButton materialbutton1;
	private Button button2;
	private MaterialButton materialbutton2;
	private TextView textview11;
	private ListView listview1;
	private GridView gridview1;
	private RecyclerView recyclerview1;
	private Spinner spinner1;
	private ViewPager viewpager1;
	private TextView textview18;
	private PatternLockView patternlockview2;
	private CodeView codeview2;
	private OTPView otpview2;
	private LottieAnimationView lottie2;
	private BadgeView badgeview1;
	private WaveSideBar wavesidebar2;
	private TextView textview13;
	private SignInButton signinbutton1;
	private YouTubePlayerView youtube1;
	private TextView textview14;
	private DigitalClock digitalclock1;
	private TimePicker timepicker1;
	private DatePicker datepicker1;
	private AnalogClock analogclock1;
	private CalendarView calendarview1;
	private TextView textview15;
	private CollapsingToolbarLayout collapsingtoolbar1;
	private TabLayout tablayout1;
	private BottomNavigationView bottomnavigation3;
	private TextInputLayout textinputlayout1;
	private SwipeRefreshLayout swiperefreshlayout1;
	private CardView cardview1;
	private TextView textview17;
	private LinearLayout linear3;
	private LinearLayout linear2;
	private HorizontalScrollView hscroll1;
	private ScrollView vscroll2;
	private RadioGroup radiogroup1;
	
	private Intent xcore = new Intent();
	private SharedPreferences sps;
	private SharedPreferences xcorelib;
	private Calendar calendar = Calendar.getInstance();
	private Vibrator vibrator;
	private TimerTask timer;
	private AlertDialog.Builder dialog;
	private MediaPlayer mediaplayer;
	private SoundPool soundpool;
	private ObjectAnimator objectanimator = new ObjectAnimator();
	private Intent camera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
	private File _file_camera;
	private Intent fileall = new Intent(Intent.ACTION_GET_CONTENT);
	private SensorManager gyro;
	private SensorEventListener _gyro_sensor_listener;
	private TextToSpeech tts;
	private SpeechRecognizer stt;
	private RequestNetwork requestnet;
	private RequestNetwork.RequestListener _requestnet_request_listener;
	private BluetoothConnect bluetooth;
	private BluetoothConnect.BluetoothConnectionListener _bluetooth_bluetooth_connection_listener;
	private LocationManager locationmanager;
	private LocationListener _locationmanager_location_listener;
	private ProgressDialog pdialog;
	private DatePickerDialog dpdialog;
	private TimePickerDialog tpdialog;
	private TimePickerDialog.OnTimeSetListener tpdialog_listener;
	private Notification notification;
	private com.facebook.ads.AdView facebookadsbanner;
	private AdListener facebookadsbanner_AdListener;
	private com.facebook.ads.InterstitialAd facebookads;
	private InterstitialAdListener facebookads_InterstitialAdListener;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED
		|| ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO, Manifest.permission.ACCESS_FINE_LOCATION}, 1000);
		} else {
			initializeLogic();
		}
	}
	
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		textview8 = findViewById(R.id.textview8);
		textview19 = findViewById(R.id.textview19);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview6 = findViewById(R.id.textview6);
		textview7 = findViewById(R.id.textview7);
		textview9 = findViewById(R.id.textview9);
		edittext2 = findViewById(R.id.edittext2);
		autocomplete1 = findViewById(R.id.autocomplete1);
		multiautocomplete1 = findViewById(R.id.multiautocomplete1);
		progressbar2 = findViewById(R.id.progressbar2);
		progressbar1 = findViewById(R.id.progressbar1);
		imageview2 = findViewById(R.id.imageview2);
		circleimageview1 = findViewById(R.id.circleimageview1);
		ratingbar1 = findViewById(R.id.ratingbar1);
		searchview1 = findViewById(R.id.searchview1);
		videoview1 = findViewById(R.id.videoview1);
		MediaController videoview1_controller = new MediaController(this);
		videoview1.setMediaController(videoview1_controller);
		switch1 = findViewById(R.id.switch1);
		radiobutton1 = findViewById(R.id.radiobutton1);
		checkbox1 = findViewById(R.id.checkbox1);
		seekbar1 = findViewById(R.id.seekbar1);
		textview10 = findViewById(R.id.textview10);
		button1 = findViewById(R.id.button1);
		materialbutton1 = findViewById(R.id.materialbutton1);
		button2 = findViewById(R.id.button2);
		materialbutton2 = findViewById(R.id.materialbutton2);
		textview11 = findViewById(R.id.textview11);
		listview1 = findViewById(R.id.listview1);
		gridview1 = findViewById(R.id.gridview1);
		recyclerview1 = findViewById(R.id.recyclerview1);
		spinner1 = findViewById(R.id.spinner1);
		viewpager1 = findViewById(R.id.viewpager1);
		textview18 = findViewById(R.id.textview18);
		patternlockview2 = findViewById(R.id.patternlockview2);
		codeview2 = findViewById(R.id.codeview2);
		otpview2 = findViewById(R.id.otpview2);
		lottie2 = findViewById(R.id.lottie2);
		badgeview1 = findViewById(R.id.badgeview1);
		wavesidebar2 = findViewById(R.id.wavesidebar2);
		textview13 = findViewById(R.id.textview13);
		signinbutton1 = findViewById(R.id.signinbutton1);
		youtube1 = findViewById(R.id.youtube1);
		textview14 = findViewById(R.id.textview14);
		digitalclock1 = findViewById(R.id.digitalclock1);
		timepicker1 = findViewById(R.id.timepicker1);
		datepicker1 = findViewById(R.id.datepicker1);
		analogclock1 = findViewById(R.id.analogclock1);
		calendarview1 = findViewById(R.id.calendarview1);
		textview15 = findViewById(R.id.textview15);
		collapsingtoolbar1 = findViewById(R.id.collapsingtoolbar1);
		tablayout1 = findViewById(R.id.tablayout1);
		bottomnavigation3 = findViewById(R.id.bottomnavigation3);
		textinputlayout1 = findViewById(R.id.textinputlayout1);
		swiperefreshlayout1 = findViewById(R.id.swiperefreshlayout1);
		cardview1 = findViewById(R.id.cardview1);
		textview17 = findViewById(R.id.textview17);
		linear3 = findViewById(R.id.linear3);
		linear2 = findViewById(R.id.linear2);
		hscroll1 = findViewById(R.id.hscroll1);
		vscroll2 = findViewById(R.id.vscroll2);
		radiogroup1 = findViewById(R.id.radiogroup1);
		sps = getSharedPreferences("sps", Activity.MODE_PRIVATE);
		xcorelib = getSharedPreferences("xcore", Activity.MODE_PRIVATE);
		vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		dialog = new AlertDialog.Builder(this);
		_file_camera = FileUtil.createNewPictureFile(getApplicationContext());
		Uri _uri_camera;
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
			_uri_camera = FileProvider.getUriForFile(getApplicationContext(), getApplicationContext().getPackageName() + ".provider", _file_camera);
		} else {
			_uri_camera = Uri.fromFile(_file_camera);
		}
		camera.putExtra(MediaStore.EXTRA_OUTPUT, _uri_camera);
		camera.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
		fileall.setType("*/*");
		fileall.putExtra(Intent.EXTRA_ALLOW_MULTIPLE, true);
		gyro = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		if (gyro.getDefaultSensor(Sensor.TYPE_GYROSCOPE) == null) {
			SketchwareUtil.showMessage(getApplicationContext(), "Gyroscope is not supported on this device");
		}
		tts = new TextToSpeech(getApplicationContext(), null);
		stt = SpeechRecognizer.createSpeechRecognizer(this);
		requestnet = new RequestNetwork(this);
		bluetooth = new BluetoothConnect(this);
		locationmanager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		dpdialog = new DatePickerDialog(this);
		tpdialog = new TimePickerDialog(this, tpdialog_listener, Calendar.HOUR_OF_DAY, Calendar.MINUTE, false);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_gyro_sensor_listener = new SensorEventListener() {
			@Override
			public void onSensorChanged(SensorEvent _param1) {
				float[] _rotationMatrix = new float[16];
				SensorManager.getRotationMatrixFromVector(_rotationMatrix, _param1.values);
				float[] _remappedRotationMatrix = new float[16];
				SensorManager.remapCoordinateSystem(_rotationMatrix, SensorManager.AXIS_X, SensorManager.AXIS_Z, _remappedRotationMatrix);
				float[] _orientations = new float[3];
				SensorManager.getOrientation(_remappedRotationMatrix, _orientations);
				for (int _i = 0; _i < 3; _i++) {
					_orientations[_i] = (float)(Math.toDegrees(_orientations[_i]));
				}
				final double _x = _orientations[0];
				final double _y = _orientations[1];
				final double _z = _orientations[2];
				
			}
			
			@Override
			public void onAccuracyChanged(Sensor _param1, int _param2) {
				
			}
		};
		gyro.registerListener(_gyro_sensor_listener, gyro.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR), SensorManager.SENSOR_DELAY_NORMAL);
		
		_requestnet_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
		
		_bluetooth_bluetooth_connection_listener = new BluetoothConnect.BluetoothConnectionListener() {
			@Override
			public void onConnected(String _param1, HashMap<String, Object> _param2) {
				final String _tag = _param1;
				final HashMap<String, Object> _deviceData = _param2;
				
			}
			
			@Override
			public void onDataReceived(String _param1, byte[] _param2, int _param3) {
				final String _tag = _param1;
				final String _data = new String(_param2, 0, _param3);
				
			}
			
			@Override
			public void onDataSent(String _param1, byte[] _param2) {
				final String _tag = _param1;
				final String _data = new String(_param2);
				
			}
			
			@Override
			public void onConnectionError(String _param1, String _param2, String _param3) {
				final String _tag = _param1;
				final String _connectionState = _param2;
				final String _errorMessage = _param3;
				
			}
			
			@Override
			public void onConnectionStopped(String _param1) {
				final String _tag = _param1;
				
			}
		};
	}
	
	private void initializeLogic() {
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}