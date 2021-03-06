package micdoodle8.mods.galacticraft.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;

public class GCCoreThreadVersionCheck extends Thread
{
    public static GCCoreThreadVersionCheck instance = new GCCoreThreadVersionCheck();
    private int count = 0;

    public GCCoreThreadVersionCheck()
    {
        super("Galacticraft Version Check Thread");
    }

    public static void startCheck(Side sideToCheck)
    {
        final Thread thread = new Thread(GCCoreThreadVersionCheck.instance);
        thread.start();
    }

    @Override
    public void run()
    {
        final Side sideToCheck = FMLCommonHandler.instance().getSide();

        if (sideToCheck == null)
        {
            return;
        }

        while (this.count < 3 && GalacticraftCore.remoteBuildVer == 0)
        {
            try
            {
                final URL url = new URL("http://micdoodle8.com/galacticraft/version.html");
                final HttpURLConnection http = (HttpURLConnection) url.openConnection();
                http.addRequestProperty("User-Agent", "Mozilla/4.76");
                final BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
                String str;
                String str2[] = null;

                while ((str = in.readLine()) != null)
                {

                    if (str.contains("Version"))
                    {
                        str = str.replace("Version=", "");

                        str2 = str.split("#");

                        if (str2 != null && str2.length == 3)
                        {
                            GalacticraftCore.remoteMajVer = Integer.parseInt(str2[0]);
                            GalacticraftCore.remoteMinVer = Integer.parseInt(str2[1]);
                            GalacticraftCore.remoteBuildVer = Integer.parseInt(str2[2]);
                        }

                        if (GalacticraftCore.remoteMajVer > GalacticraftCore.LOCALMAJVERSION || GalacticraftCore.remoteMajVer == GalacticraftCore.LOCALMAJVERSION && GalacticraftCore.remoteMinVer > GalacticraftCore.LOCALMINVERSION || GalacticraftCore.remoteMajVer == GalacticraftCore.LOCALMAJVERSION && GalacticraftCore.remoteMinVer == GalacticraftCore.LOCALMINVERSION && GalacticraftCore.remoteBuildVer > GalacticraftCore.LOCALBUILDVERSION)
                        {
                            Thread.sleep(5000);

                            if (sideToCheck.equals(Side.CLIENT))
                            {
                                FMLClientHandler.instance().getClient().thePlayer.addChatMessage(LanguageRegistry.instance().getStringLocalization("newversion.message1.name", "en_US") + String.valueOf(GalacticraftCore.remoteMajVer) + "." + String.valueOf(GalacticraftCore.remoteMinVer) + "." + String.valueOf(GalacticraftCore.remoteBuildVer) + " \u00a71http://micdoodle8.com/");
                            }
                            else if (sideToCheck.equals(Side.SERVER))
                            {
                                GCLog.severe(LanguageRegistry.instance().getStringLocalization("newversion.message2.name", "en_US") + String.valueOf(GalacticraftCore.remoteMajVer) + "." + String.valueOf(GalacticraftCore.remoteMinVer) + "." + String.valueOf(GalacticraftCore.remoteBuildVer) + " http://micdoodle8.com/");
                            }
                        }
                    }
                }
            }
            catch (final Exception e)
            {
            }

            if (GalacticraftCore.remoteBuildVer == 0)
            {
                try
                {
                    GCLog.severe(LanguageRegistry.instance().getStringLocalization("newversion.failed.name", "en_US"));
                    Thread.sleep(15000);
                }
                catch (final InterruptedException e)
                {
                }
            }
            else
            {
                GCLog.info(LanguageRegistry.instance().getStringLocalization("newversion.success.name", "en_US") + " " + GalacticraftCore.remoteMajVer + "." + GalacticraftCore.remoteMinVer + "." + GalacticraftCore.remoteBuildVer);
            }

            this.count++;
        }
    }
}
