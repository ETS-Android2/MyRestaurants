package com.stephen.myrestaurants.ui;


import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import com.stephen.myrestaurants.Constants;
import com.stephen.myrestaurants.R;
import com.stephen.myrestaurants.adapters.FirebaseRestaurantListAdapter;
import com.stephen.myrestaurants.adapters.FirebaseRestaurantViewHolder;
import com.stephen.myrestaurants.models.Restaurant;
import com.stephen.myrestaurants.util.OnStartDragListener;
import com.stephen.myrestaurants.util.SimpleItemTouchHelperCallback;

import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.Query;

public class SavedRestaurantListActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_restaurant_list);
    }

}
