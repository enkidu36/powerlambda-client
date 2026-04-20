# Powerλ Design System (v0.1)

## Overview

Powerλ uses a **dark, performance-focused UI** with precise, data-driven visual language.  
The goal is to feel like a serious cycling analytics tool—not a social or lifestyle app.

Design principles:
- Dark-first (optimized for long sessions)
- High signal-to-noise ratio
- Functional color meaning (aligned with cycling training zones)
- Minimal, fast, and readable

---

## 🎨 Color System new test

### Base Colors (Foundation)

| Usage            | Color   | Hex       |
|------------------|--------|-----------|
| Background       | Navy   | `#0b1220` |
| Surface          | Panel  | `#111827` |
| Elevated Surface | Card   | `#1f2937` |

Notes:
- Avoid pure black (`#000000`)
- Use subtle elevation differences for hierarchy

---

### Text Colors

| Usage          | Color        | Hex       |
|----------------|-------------|-----------|
| Primary Text   | White       | `#f9fafb` |
| Secondary Text | Gray 400    | `#9ca3af` |
| Muted Text     | Gray 500    | `#6b7280` |

---

### Brand Accent (Primary Identity)

**Gradient:**
- Start: `#22c55e` (green)
- End: `#3b82f6` (blue)

Usage:
- Logo (λ arc + node)
- Highlighted metrics (power, FTP, key stats)
- Active states (selected elements, hover states)
- Graph emphasis

---

### Functional Training Colors

These map directly to cycling effort zones:

| Zone Type     | Color        | Hex       |
|---------------|-------------|-----------|
| Endurance     | Green       | `#22c55e` |
| Tempo         | Blue        | `#3b82f6` |
| Threshold     | Orange      | `#f59e0b` |
| VO2 Max       | Red         | `#ef4444` |

Guidelines:
- Use consistently across charts and intervals
- Avoid mixing meanings (color = effort level)

---

## 🧩 UI Principles

### 1. Dark Mode First
- Optimize for early morning / evening training usage
- Reduce eye strain
- Prioritize contrast and readability

### 2. Data Density > Decoration
- Show meaningful metrics
- Avoid unnecessary UI elements
- Every component should serve performance insight

### 3. Hierarchy via Contrast
- Use brightness and spacing instead of heavy borders
- Let important data stand out naturally

---

## 📊 Charts & Data Visualization

- Prefer clean, minimal line charts
- Use the green → blue gradient for key curves (e.g., power curve)
- Highlight current/important values with brighter accents
- Keep gridlines subtle (`#1f2937` or lighter)

---

## ⚡ Interaction & Feedback

Use accent colors intentionally:

- Hover → slightly brighter accent
- Active → full gradient or bold color
- Selected → persistent highlight

---

## 🚫 Anti-Patterns

Avoid:

- Light mode as default
- Overuse of bright/neon colors
- Pure black backgrounds
- Heavy borders and clutter
- “Gamer UI” aesthetics

---

## 🧠 Brand Feel

Powerλ should feel like:

> A precision tool for serious cyclists who care about data, performance, and optimization.

Not:
- A social network
- A casual fitness tracker
- A gamified experience

---

## 🔮 Future Extensions

- Use gradient for loading/progress indicators
- Animate λ arc subtly for feedback
- Expand chart system with consistent zone coloring

---

## 🏁 Summary

- Dark, focused UI
- Strong green → blue identity
- Functional, meaningful color usage
- Built for performance, not decoration
