/**
 * Created by Jernej on 6. 03. 2017.
 */

public class ApplicationMy extends Application {
    public class ActivityMain extends AppCompatActivity {
        ApplicationMy app;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            app = (ApplicationMy) getApplication();


        }