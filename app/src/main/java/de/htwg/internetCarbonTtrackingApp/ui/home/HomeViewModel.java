package de.htwg.internetCarbonTtrackingApp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Home view for a general overview about my internet-carbon usage");
    }

    public LiveData<String> getText() {
        return mText;
    }
}