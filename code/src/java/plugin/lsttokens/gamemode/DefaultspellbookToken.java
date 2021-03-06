package plugin.lsttokens.gamemode;

import java.net.URI;

import pcgen.core.GameMode;
import pcgen.persistence.lst.GameModeLstToken;

/**
 * Class deals with DEFAULTSPELLBOOK Token
 */
public class DefaultspellbookToken implements GameModeLstToken
{

    @Override
	public String getTokenName()
	{
		return "DEFAULTSPELLBOOK";
	}

    @Override
	public boolean parse(GameMode gameMode, String value, URI source)
	{
		gameMode.setDefaultSpellBook(value);
		return true;
	}
}
