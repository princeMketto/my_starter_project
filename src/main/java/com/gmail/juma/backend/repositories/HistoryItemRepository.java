package com.gmail.juma.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gmail.juma.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
