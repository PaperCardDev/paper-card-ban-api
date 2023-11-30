package cn.paper_card.paper_card_ban.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

@SuppressWarnings("unused")
public interface PaperCardBanApi {

    // report list 查看所有没有处理举报记录列表
    // report list-accepted 查看成功的举报
    // report list-rejected 查看失败的举报
    // report player <游戏名> <理由> 举报玩家
    // report view <举报ID> 查看举报信息
    // report accept <举报ID> <备注信息> 举报成功
    // report reject <举报ID> <备注信息> 举报失败

    @NotNull BanService getBanService();

    @NotNull ReportService getReportService();

    // 返回NULL表示allow，否则返回kickMessage
    @Nullable Object checkPlayerBanned(@NotNull UUID uuid, @NotNull String name) throws Exception;

    // 返回NULL表示allow，否则返回kickMessage
    @Nullable Object checkPlayerReported(@NotNull UUID uuid, @NotNull String name) throws Exception;
}
