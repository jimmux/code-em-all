import { expect, test } from "@playwright/test";

test("home page has expected canvas", async ({ page }) => {
  await page.goto("/");
  await expect(page.locator("canvas")).toBeVisible();
});
