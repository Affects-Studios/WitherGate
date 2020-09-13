package fr.larsouille.wglauncher;

import fr.flowarg.flowlogger.Logger;
import fr.flowarg.flowupdater.FlowUpdater;
import fr.flowarg.flowupdater.utils.BuilderArgumentException;
import fr.flowarg.flowupdater.versions.IVanillaVersion;
import fr.flowarg.flowupdater.versions.VersionType;
import fr.flowarg.flowupdater.versions.download.IProgressCallback;
import fr.flowarg.openlauncherlib.NewForgeVersionDiscriminator;
import fr.theshark34.openlauncherlib.minecraft.GameInfos;
import fr.theshark34.openlauncherlib.minecraft.GameTweak;
import fr.theshark34.openlauncherlib.minecraft.GameType;
import fr.theshark34.openlauncherlib.minecraft.GameVersion;

import java.io.File;
import java.io.IOException;


public class Launcher
{
    public static final GameVersion WG_VERSION = new GameVersion("1.15.2", GameType.V1_13_HIGER_FORGE.setNewForgeVersionDiscriminator(new NewForgeVersionDiscriminator("31.2.0", "1.15.2", "net.minecraftforge", "20200414.225201")));
    public static final GameInfos WG_INFOS = new GameInfos("WhitherGate", WG_VERSION, new GameTweak[]{});
    public static final File WG_DIR = WG_INFOS.getGameDir();

    public void update(File dir, IProgressCallback callback) throws IOException
    {
        final IVanillaVersion.Builder versionBuilder = new IVanillaVersion.Builder("1.16.1");
        final IVanillaVersion version = versionBuilder.build(false, VersionType.VANILLA);
        final FlowUpdater updater;
        try {
            updater = new FlowUpdater.FlowUpdaterBuilder().withVersion(version).withLogger(new Logger("[WitherGate Launcher]", new File(dir, "launcher.log"))).withSilentUpdate(true).withProgressCallback(callback).build();
            updater.update(dir, false);
        } catch (BuilderArgumentException e) {
            e.printStackTrace();
        }
    }
}
