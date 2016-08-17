package space.cyclic.reference.soundbite.app;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.*;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends ActionBarActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        myFavorite = MediaPlayer.create(this, R.raw.oh_my_favorite);
        iBrokeMyBack = MediaPlayer.create(this, R.raw.i_broke_my_back);
        backIsBroken = MediaPlayer.create(this, R.raw.back_is_broken);
        spinal = MediaPlayer.create(this, R.raw.spinal);
        crystalLight = MediaPlayer.create(this, R.raw.crystal_light);
        smartEnough = MediaPlayer.create(this, R.raw.smart_enough);
        aaron = MediaPlayer.create(this, R.raw.aaron);
        murder = MediaPlayer.create(this, R.raw.murder);
        imNotASmartMan = MediaPlayer.create(this, R.raw.im_not_a_smart_man);
        butIKnowWhatLoveIs = MediaPlayer.create(this, R.raw.but_i_know_what_love_is);
        youreGoddamnedRight = MediaPlayer.create(this, R.raw.your_goddamned_right);
        yeah = MediaPlayer.create(this, R.raw.yeah);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return getString(R.string.title_section1).toUpperCase(l);
                case 1:
                    return getString(R.string.title_section2).toUpperCase(l);
                case 2:
                    return getString(R.string.title_section3).toUpperCase(l);
            }
            return null;
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_main, container, false);
        }
    }

    MediaPlayer myFavorite;

    public void myFavorite(View view) {
        if (!myFavorite.isPlaying()) {
            myFavorite.start();
            Toast.makeText(this, "OH MY FAVORITE", Toast.LENGTH_LONG).show();
        }
    }

    MediaPlayer iBrokeMyBack;

    public void iBrokeMyBack(View view) {
        playMedia(iBrokeMyBack);
    }

    MediaPlayer backIsBroken;

    public void backIsBroken(View view) {
        playMedia(backIsBroken);
    }

    MediaPlayer spinal;

    public void spinal(View view) {
        playMedia(spinal);
    }

    MediaPlayer crystalLight;

    public void crystalLight(View view) {
        playMedia(crystalLight);
    }

    MediaPlayer smartEnough;

    public void smartEnough(View view) {
        playMedia(smartEnough);
    }

    MediaPlayer aaron;

    public void aaron(View view) {
        playMedia(aaron);
    }

    MediaPlayer murder;

    public void murder(View view) {
        playMedia(murder);
    }

    MediaPlayer imNotASmartMan;

    public void imNotASmartMan(View view) {
        playMedia(imNotASmartMan);
    }

    MediaPlayer butIKnowWhatLoveIs;

    public void butIKnowWhatLoveIs(View view) {
        playMedia(butIKnowWhatLoveIs);
    }

    MediaPlayer youreGoddamnedRight;

    public void youreGoddamnedRight(View view) {
        playMedia(youreGoddamnedRight);
    }

    private MediaPlayer yeah;

    public void yeah(View view) {
        playMedia(yeah);
    }

    private void playMedia(MediaPlayer mediaPlayer) {
        if (!mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }
    }
}
