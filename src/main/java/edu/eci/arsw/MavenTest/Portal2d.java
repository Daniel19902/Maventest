package edu.eci.arsw.MavenTest;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Portal2d extends Game {
    SpriteBatch batch;
    private OrthographicCamera camera;
    private King king;

    public void create() {
        this.batch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(false,800,400);
        camera.update();
        this.king = new King(10,10);
    }

    public void render () {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        this.camera.update();
        this.batch.setProjectionMatrix(camera.combined);

        this.batch.begin();
        this.king.render(batch);
        this.king.setX(this.king.getX()+1);
        this.batch.end();
    }
}
