package cn.paper_card.paper_card_ban.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface ReportService {

    // 返回举报ID
    int addReport(@NotNull ReportInfo info) throws Exception;

    // 根据ID查询
    @Nullable ReportInfo queryById(int id) throws Exception;

    // 分页查询未处理的举报记录
    @NotNull List<ReportInfo> queryPendingByPage(int limit, int offset) throws Exception;

    // 分页查询举报成功的举报记录
    @NotNull List<ReportInfo> queryByStateWithPageOrderByTimeDesc(@NotNull ReportState state, int limit, int offset) throws Exception;

    // 查询玩家从指定时间开始是否被举报过(未处理的)
    @Nullable ReportInfo queryByTargetPlayer(@NotNull UUID uuid, long beginTime) throws Exception;

    // 设置状态
    boolean updateReport(int id, @NotNull ReportState state, @NotNull String operatorName, @NotNull UUID uuid, @NotNull String comment) throws Exception;

    // 删除举报记录
    boolean deleteById(int id) throws Exception;
}
