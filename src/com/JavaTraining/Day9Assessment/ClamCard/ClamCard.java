package com.JavaTraining.Day9Assessment.ClamCard;

import java.util.HashMap;
import java.util.Map;

public class ClamCard {
    private double currentCost = 0;
   private final Map<String, Double> zoneA = new HashMap<>();
   private final Map<String, Double> zoneB = new HashMap<>();

    ClamCard() {
        zoneA.put("Single", 2.50);
        zoneA.put("Day", 7.00);
        zoneA.put("Week", 40.00);
        zoneA.put("Month", 145.00);
        zoneB.put("Single", 3.00);
        zoneB.put("Day", 8.00);
        zoneB.put("Week", 47.00);
        zoneB.put("Month", 165.00);
    }

    void travel(String from, String to) {
        from = from.toUpperCase().trim();
        to = to.toUpperCase().trim();
        if (from.charAt(0) == 'A' && to.charAt(0) == 'A') {
            if (this.currentCost < zoneA.get("Day")) {
                double sudoCost = this.currentCost + zoneA.get("Single");
                double actualCost = zoneA.get("Day") - this.currentCost;
                if (sudoCost > zoneA.get("Day")) {
                    this.currentCost += actualCost;
                } else {
                    this.currentCost += zoneA.get("Single");
                }
            }
        }

        if (from.charAt(0) == 'B' && to.charAt(0) == 'B') {
            if (this.currentCost < zoneB.get("Day")) {
                double sudoCost = this.currentCost + zoneB.get("Single");
                double actualCost = zoneB.get("Day") - this.currentCost;
                if (sudoCost > zoneB.get("Day")) {
                    this.currentCost += actualCost;
                } else {
                    this.currentCost += zoneB.get("Single");
                }
            }
        }

        if (from.charAt(0) == 'A' && to.charAt(0) == 'B') {
            if (this.currentCost < zoneB.get("Day")) {
                double sudoCost = this.currentCost + zoneB.get("Single");
                double actualCost = zoneB.get("Day") - this.currentCost;
                if (sudoCost > zoneB.get("Day")) {
                    this.currentCost += actualCost;
                } else {
                    this.currentCost += zoneB.get("Single");
                }
            }
        }

        if (from.charAt(0) == 'B' && to.charAt(0) == 'A') {
            if (this.currentCost < zoneB.get("Day")) {
                double sudoCost = this.currentCost + zoneB.get("Single");
                double actualCost = zoneB.get("Day") - this.currentCost;
                if (sudoCost > zoneB.get("Day")) {
                    this.currentCost += actualCost;
                } else {
                    this.currentCost += zoneB.get("Single");
                }
            }
        }
    }

    double getTotalCost() {
        return this.currentCost;
    }

}
