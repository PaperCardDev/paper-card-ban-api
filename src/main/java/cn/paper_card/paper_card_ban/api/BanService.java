package cn.paper_card.paper_card_ban.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

@SuppressWarnings("unused")
public interface BanService {

    // 返回封禁ID
    int addBan(@NotNull BanInfo banInfo) throws Exception;

    // 删除
    boolean deleteBan(int id) throws Exception;

    // 查询正在生效的，如果有多个，返回最长时间的
    @Nullable BanInfo queryActiveByBanedUuid(@NotNull UUID uuid, long cur) throws Exception;

    // 关于某个玩家的封禁记录，分页查询
    @NotNull List<BanInfo> queryAboutPlayerByPage(@NotNull UUID uuid, int limit, int offset) throws Exception;

    // 分页查询全部记录，按时间降序排序
    @NotNull List<BanInfo> queryAllByPageOrderByTimeDesc(int limit, int offset) throws Exception;

    // 根据ID查询
    @Nullable BanInfo queryById(int id) throws Exception;

    // 设置是否启用封禁
    boolean updateEnableById(int id, boolean enable) throws Exception;
}
