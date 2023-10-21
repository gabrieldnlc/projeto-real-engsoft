package com.gdx.game.status;

import com.gdx.game.profile.ProfileManager;

public class UpdatedLevelFromQuest implements StatusEvent {
    public UpdatedLevelFromQuest() {}

    @Override
    public void changeStatus(StatusSubject statusUI) {
        ProfileManager.getInstance().setProperty("currentPlayerLevel", statusUI.getLevelValue());
    }
}
