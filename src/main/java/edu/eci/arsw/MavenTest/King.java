package edu.eci.arsw.MavenTest;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class King {

    private Sprite sprite;
    private int x,y;

    public King(int x, int y){
        this.x = x;
        this.y = y;
        this.sprite = new Sprite( new Texture(Gdx.files.internal("img/king100.png")),100,100);
    }

    public void setX(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void render(final SpriteBatch spriteBatch){
        spriteBatch.draw(sprite,x,y);
    }

}
