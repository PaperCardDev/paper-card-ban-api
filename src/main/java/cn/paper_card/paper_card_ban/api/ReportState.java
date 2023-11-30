package cn.paper_card.paper_card_ban.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressWarnings("unused")
public enum ReportState {
    Pending(0, "未处理"),
    Accepted(1, "已接受"),
    Rejected(2, "已拒绝");

    private final int v;
    private final String str;

    ReportState(int v, @NotNull String str) {
        this.v = v;
        this.str = str;
    }

    public @NotNull String getStr() {
        return this.str;
    }

    public int getInt() {
        return this.v;
    }

    public static @Nullable ReportState fromInt(int i) {
        for (ReportState value : values()) {
            if (value.v == i) return value;
        }
        return null;
    }
}