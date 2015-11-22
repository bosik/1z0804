package org.bosik.ocjp2.s04.i1.t1;

/**
 * This file contains no GenericTest2 class, and that's OK
 */

class Game
{
}

class Cricket extends Game
{
}

class Instrument
{
}

class Guitar extends Instrument
{
}

interface Player<E>
{
	void play(E e);
}

interface GamePlayer<E extends Game> extends Player<E>
{
}

// Note: parameter E is unused and DON'T relate to Player's E
interface MusicPlayer<E extends Instrument> extends Player
{
}

class MidiPlayer implements MusicPlayer<Instrument>
{
	@Override
	public void play(Object e)
	{
	}
}
