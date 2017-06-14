/*
 * This file is part of "hybris integration" plugin for Intellij IDEA.
 * Copyright (C) 2014-2016 Alexander Bartash <AlexanderBartash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

// This is a generated file. Not intended for manual editing.
package com.intellij.idea.plugin.hybris.flexibleSearch.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchBetweenPredicate;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchCompOp;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchExistsPredicate;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchLikePredicate;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchNullPredicate;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchPredicate;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchRowValuePredicand;
import com.intellij.idea.plugin.hybris.flexibleSearch.psi.FlexibleSearchVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FlexibleSearchPredicateImpl extends ASTWrapperPsiElement implements FlexibleSearchPredicate {

    public FlexibleSearchPredicateImpl(ASTNode node) {
        super(node);
    }

    public void accept(@NotNull FlexibleSearchVisitor visitor) {
        visitor.visitPredicate(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof FlexibleSearchVisitor) {
            accept((FlexibleSearchVisitor) visitor);
        } else {
            super.accept(visitor);
        }
    }

    @Override
    @Nullable
    public FlexibleSearchBetweenPredicate getBetweenPredicate() {
        return findChildByClass(FlexibleSearchBetweenPredicate.class);
    }

    @Override
    @Nullable
    public FlexibleSearchCompOp getCompOp() {
        return findChildByClass(FlexibleSearchCompOp.class);
    }

    @Override
    @Nullable
    public FlexibleSearchExistsPredicate getExistsPredicate() {
        return findChildByClass(FlexibleSearchExistsPredicate.class);
    }

    @Override
    @Nullable
    public FlexibleSearchLikePredicate getLikePredicate() {
        return findChildByClass(FlexibleSearchLikePredicate.class);
    }

    @Override
    @Nullable
    public FlexibleSearchNullPredicate getNullPredicate() {
        return findChildByClass(FlexibleSearchNullPredicate.class);
    }

    @Override
    @NotNull
    public List<FlexibleSearchRowValuePredicand> getRowValuePredicandList() {
        return PsiTreeUtil.getChildrenOfTypeAsList(this, FlexibleSearchRowValuePredicand.class);
    }

}