package com.papiricoh.pokegame.screen;

import com.badlogic.gdx.Screen;
import com.papiricoh.pokegame.PokeGame;

public abstract class AbstractScreen implements Screen {

    private PokeGame app;

    public AbstractScreen(PokeGame app) {
        this.app = app;
    }

    @Override
    public abstract void dispose();

    @Override
    public abstract void show();

    @Override
    public abstract void render(float delta);

    @Override
    public abstract void resize(int width, int height);

    @Override
    public abstract void pause();

    @Override
    public abstract void resume();

    @Override
    public abstract void hide();

}
