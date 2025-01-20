package com.example.watchlistms.WatchlistRepository;

import com.example.watchlistms.entity.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {
}
