package com.mygdx.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;
import java.util.ArrayList;
import java.util.Random;

public class MyGdxGame extends ApplicationAdapter {
	ShapeRenderer shape;
	ShapeRenderer shape2;
	Ball ball;
	Paddle paddle1;
	Paddle paddle2;
	ArrayList<Ball> balls = new ArrayList<>();
	Random r = new Random();
	@Override
	public void create() {
		shape = new ShapeRenderer();
		ball = new Ball(0, 0, 12, 10, 10);
		paddle1 = new Paddle(10,60,5,50,5);
		paddle2 = new Paddle(600,50,5,50,5);
	}

	@Override
	public void render() {

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		ball.update();
		shape.begin(ShapeRenderer.ShapeType.Filled);
		ball.draw(shape);
		paddle1.draw(shape);
		paddle2.draw(shape);
		shape.end();
		paddle1.update();
		paddle2.update2();



	}



}