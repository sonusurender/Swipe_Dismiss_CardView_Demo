package com.swipedismisscardview_demo;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView textCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textCardView = (CardView) findViewById(R.id.text_card_view);
        implementSwipeDismiss();
    }

    /**
     * method to implement swipe dismiss feature over card view
     **/
    private void implementSwipeDismiss() {
        SwipeDismissBehavior swipeDismissBehavior = new SwipeDismissBehavior();
        swipeDismissBehavior.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY);//Swipe direction i.e any direction, here you can put any direction LEFT or RIGHT

        CoordinatorLayout.LayoutParams layoutParams =
                (CoordinatorLayout.LayoutParams) textCardView.getLayoutParams();

        layoutParams.setBehavior(swipeDismissBehavior);//set swipe behaviour to Coordinator layout
    }
}
