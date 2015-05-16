package ketsakda.app.egov.feed;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import app.aenc.com.material.R;

/**
 * Created by ketsakda on 4/19/15.
 */
public class BaseActivity extends ActionBarActivity {


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case android.R.id.home:
                overridePendingTransition(R.anim.move_left_in_activity, R.anim.move_right_out_activity);
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.anim.move_left_in_activity, R.anim.move_right_out_activity);
    }
}
