package edu.illinois.cs.cs125.coolminesweeper.views.gameboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import edu.illinois.cs.cs125.coolminesweeper.Laucher;


/**
 *
 */
public class GameBoard extends GridView {

    public GameBoard(Context context , AttributeSet attrs){
        super(context,attrs);

        Laucher.getInstance().createGrid(context);

        setNumColumns(Laucher.WIDTH);
        setAdapter(new GridAdapter());
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private class GridAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return Laucher.getInstance().WIDTH * Laucher.getInstance().HEIGHT;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return Laucher.getInstance().getCellAt(position);
        }
    }
}
