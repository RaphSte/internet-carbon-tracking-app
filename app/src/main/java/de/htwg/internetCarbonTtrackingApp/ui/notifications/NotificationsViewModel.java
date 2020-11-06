package de.htwg.internetCarbonTtrackingApp.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("(Yet) notification fragment. Might be changed to be general setting instead");
    }

    public LiveData<String> getText() {
        return mText;
    }
}