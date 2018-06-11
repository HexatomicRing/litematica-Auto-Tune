package fi.dy.masa.litematica.gui;

import fi.dy.masa.litematica.Reference;
import fi.dy.masa.litematica.gui.base.GuiLitematicaBase;
import fi.dy.masa.malilib.gui.IGuiIcon;
import net.minecraft.util.ResourceLocation;

public enum ButtonIcon implements IGuiIcon
{
    AREA_SELECTION          (102,   0, 14, 14),
    LOADED_SCHEMATICS       (102,  14, 14, 14),
    SCHEMATIC_BROWSER       (102,  28, 14, 14),
    SCHEMATIC_PLACEMENTS    (102,  42, 14, 14);

    public static final ResourceLocation TEXTURE = new ResourceLocation(Reference.MOD_ID, "textures/gui/gui_widgets.png");

    private final int u;
    private final int v;
    private final int w;
    private final int h;

    private ButtonIcon(int u, int v, int w, int h)
    {
        this.u = u;
        this.v = v;
        this.w = w;
        this.h = h;
    }

    @Override
    public int getWidth()
    {
        return this.w;
    }

    @Override
    public int getHeight()
    {
        return this.h;
    }

    @Override
    public int getU()
    {
        return this.u;
    }

    @Override
    public int getV()
    {
        return this.v;
    }

    @Override
    public void renderAt(int x, int y, float zLevel, boolean enabled, boolean selected)
    {
        int u = this.u;

        if (enabled)
        {
            u += this.w;
        }

        if (selected)
        {
            u += this.w;
        }

        GuiLitematicaBase.drawTexturedRect(x, y, u, this.v, this.w, this.h, zLevel);
    }

    @Override
    public ResourceLocation getTexture()
    {
        return TEXTURE;
    }
}
